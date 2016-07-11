'use strict';

angular.module('gti619_tp5.profile', [])

    .config(['$routeProvider', function($routeProvider) {
      
        $routeProvider.when('/profile', {
            templateUrl: 'modules/profile/view/profile.html',
            controller: 'ProfileCtrl'
        });
    }]);