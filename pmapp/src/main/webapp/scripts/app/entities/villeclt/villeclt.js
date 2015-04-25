'use strict';

angular.module('pmapp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('villeclt', {
                parent: 'entity',
                url: '/villeclt',
//                data: {
//                    roles: ['ROLE_USER'],
//                    pageTitle: 'jhipsterApp.villeclt.home.title'
//                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/villeclt/villeclts.html',
                        controller: 'VillecltController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('villeclt');
                        return $translate.refresh();
                    }]
                }
            })
            .state('villecltDetail', {
                parent: 'entity',
                url: '/villeclt/:id',
//                data: {
//                    roles: ['ROLE_USER'],
//                    pageTitle: 'jhipsterApp.villeclt.detail.title'
//                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/villeclt/villeclt-detail.html',
                        controller: 'VillecltDetailController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('villeclt');
                        return $translate.refresh();
                    }]
                }
            });
    });
