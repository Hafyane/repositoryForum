'use strict';

angular.module('pmapp').controller('VillecltController',
		function($scope, Villeclt, ParseLinks) {
			$scope.villeclts = [];
			$scope.page = 1;
			$scope.loadAll = function() {
				Villeclt.query({
					page : $scope.page,
					per_page : 20
				}, function(result, headers) {
					$scope.links = ParseLinks.parse(headers('link'));
					for (var i = 0; i < result.length; i++) {
						$scope.villeclts.push(result[i]);
					}
				});
			};
			$scope.reset = function() {
				$scope.page = 1;
				$scope.villeclts = [];
				$scope.loadAll();
			};
			$scope.loadPage = function(page) {
				$scope.page = page;
				$scope.loadAll();
			};
			$scope.loadAll();

			$scope.create = function() {
				Villeclt.update($scope.villeclt, function() {
					$scope.reset();
					$('#saveVillecltModal').modal('hide');
					$scope.clear();
				});
			};

			$scope.update = function(id) {
				Villeclt.get({
					id : id
				}, function(result) {
					$scope.villeclt = result;
					$('#saveVillecltModal').modal('show');
				});
			};

			//        $scope.delete = function (id) {
			//            Villeclt.get({id: id}, function(result) {
			//                $scope.villeclt = result;
			//                $('#deleteVillecltConfirmation').modal('show');
			//            });
			//        };
			//
			//        $scope.confirmDelete = function (id) {
			//            Villeclt.delete({id: id},
			//                function () {
			//                    $scope.reset();
			//                    $('#deleteVillecltConfirmation').modal('hide');
			//                    $scope.clear();
			//                });
			//        };

			$scope.clear = function() {
				$scope.villeclt = {
					nom : null,
					description : null,
					id : null
				};
				$scope.editForm.$setPristine();
				$scope.editForm.$setUntouched();
			};
		});
