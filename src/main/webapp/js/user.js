new Vue({
    el: '#app',
    data: {
        user:{
            id:"1",
            username:"",
            password:"",
            email:"",
            age:"",
            sex:""
        },
        userList:[]
    },
    methods: {
        findAll: function () {
            var _this = this;
            axios.get('/vuejsDemo/user/findAll.do')
                .then(function (response) {
                    // handle success
                    _this.userList = response.data;
                })
                .catch(function (error) {
                    // handle error
                    console.log("error");
                });
        },
        findById:function (userid) {
            var _this = this;
            axios.get('/vuejsDemo/user/findOneById.do', {params:{id:userid}})
                .then(function (response) {
                    // handle success
                    _this.user = response.data;
                    $("#myModal").modal("show");
                })
                .catch(function (error) {
                    // handle error
                    console.log("error");
                });
        },
        update: function () {
            var _this = this;
            axios.post('/vuejsDemo/user/updateUser.do', _this.user)
                .then(function () {
                    // handle success
                    _this.findAll();
                })
                .catch(function (error) {
                    // handle error
                    console.log("error");
                });
        }
    },
    created: function () {
        this.findAll();
    }
})