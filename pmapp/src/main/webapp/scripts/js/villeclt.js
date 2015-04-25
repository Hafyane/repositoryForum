'use strict';

var app = angular.module('pmapp', ['ui.router', 'ngResource','ngTable']);
app.config(function($stateProvider,$urlRouterProvider) {
	$stateProvider.state('villeclt', {
		url : '/',
		templateUrl : 'scripts/js/partial.html',
		controller : 'VillecltController'
           

	})
	
	.state('villecltDetail', {
        url: '/villeclt/:id',
                templateUrl: 'scripts/js/villeclt-detail.html',
                controller: 'VillecltDetailController'
    
    });
	
	 $urlRouterProvider.otherwise('/');
});
