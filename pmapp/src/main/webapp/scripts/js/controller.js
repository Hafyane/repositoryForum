'use strict';
// $scope.Allvilleclts = villeclts.query();
var appCtr=angular.module('pmapp');
appCtr.controller('VillecltController', function ($scope, Villeclt,ngTableParams) {
        $scope.villeclts = [];
        $scope.orderedData = [];
        $scope.loadAll = function() {
        	
            Villeclt.query({}, function(result, headers) {
                for (var i = 0; i < result.length; i++) {
                    $scope.villeclts.push(result[i]);
                    $scope.orderedData.push(result[i]);
                }
                
            });
        };
        $scope.reset = function() {
            $scope.villeclts = [];
            $scope.loadAll();
        };
        $scope.loadPage = function(page) {
            $scope.loadAll();
        };
        $scope.loadAll();

        $scope.create = function () {
            Villeclt.update($scope.villeclt,
                function () {
                    $scope.reset();
                    $('#saveVillecltModal').modal('hide');
                    $scope.clear();
                });
        };

        $scope.update = function (id) {
            Villeclt.get({id: id}, function(result) {
                $scope.villeclt = result;
                $('#saveVillecltModal').modal('show');
            });
        };

        $scope.delete = function (id) {
            Villeclt.get({id: id}, function(result) {
                $scope.villeclt = result;
                $('#deleteVillecltConfirmation').modal('show');
            });
        };

        $scope.confirmDelete = function (id) {
            Villeclt.delete({id: id},
                function () {
                    $scope.reset();
                    $('#deleteVillecltConfirmation').modal('hide');
                    $scope.clear();
                });
        };

        $scope.clear = function () {
            $scope.villeclt = {nom: null, description: null, id: null};
            $scope.editForm.$setPristine();
            $scope.editForm.$setUntouched();
        };
        
      
        
        $scope.tableParams = new ngTableParams({
        	
            page: 1,            // show first page
            count: 10           // count per page
        }, {
        	     	
            total: $scope.orderedData.length, // length of data
            getData: function($defer, params) {
                $defer.resolve($scope.orderedData.slice((params.page() - 1) * params.count(), params.page() * params.count()));
                
            }
        });
       

           });
