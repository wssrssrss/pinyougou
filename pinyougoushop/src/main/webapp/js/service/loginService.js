app.service('loginService',function ($http) {
    this.loginService=function () {
        $http.get("../login/name.do")
    }
})