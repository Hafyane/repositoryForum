'use strict';

angular.module('pmapp')
    .factory('Villeclt', function ($resource) {
        return $resource('gestion/villeclients/:id', {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    });
