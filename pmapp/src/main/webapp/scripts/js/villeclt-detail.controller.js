
'use strict';

angular.module('pmapp')
    .controller('VillecltDetailController', function ($scope, $stateParams, Villeclt) {
        $scope.villeclt = {};
        $scope.load = function (idVille) {
            Villeclt.get({id: idVille}, function(result) {
              $scope.villeclt = result;
            });
        };
        $scope.load($stateParams.id);
    });
