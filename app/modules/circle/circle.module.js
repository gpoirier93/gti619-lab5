'use strict';

angular.module('gti619_tp5.circle', [])

    .config(['$routeProvider', function($routeProvider) {
      
        $routeProvider.when('/circle', {
            templateUrl: 'modules/circle/view/circle.html',
            controller: 'CircleCtrl'
        });
    }]);