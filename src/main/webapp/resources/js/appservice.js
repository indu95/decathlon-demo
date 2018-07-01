'use strict';
decathlonApp.factory('decathlonService', function($http, $q) {
	return {
		createOrder : function(order) {
			var deferred = $q.defer();
			$http.post("orderCreation", order).then(function(response) {
				return deferred.resolve(response.data);
			}, function(errResponse) {
				console.log(errResponse);
				return deferred.reject(errResponse);
			});
			return deferred.promise;
		},
		updateStatus : function(order) {
			var deferred = $q.defer();
			console.log(order)
			$http.put("orderStatusUpdation", order).then(function(response) {
				return deferred.resolve(response.data);
			}, function(errResponse) {
				console.log(errResponse);
				return deferred.reject(errResponse);
			});
			return deferred.promise;
		}
	};
});