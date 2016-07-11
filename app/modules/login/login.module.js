'use strict';

angular.module('gti619_tp5.login', [])

    .config(['$routeProvider', function($routeProvider) {
      
        $routeProvider.when('/login', {
            templateUrl: 'modules/login/view/login.html',
            controller: 'LoginCtrl'
        });
    }]);