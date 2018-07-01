'use strict';
decathlonApp.controller('welcomeController', [ '$scope', 'decathlonService',
		'$interval', function($scope, decathlonService, $interval) {
		} ]);
decathlonApp
		.controller(
				'orderController',
				[
						'$scope',
						'decathlonService',
						'$interval',
						function($scope, decathlonService, $interval) {
							$scope.order = {};
							$("#successMsg").hide();
							$("#errorMsg").hide();
							$scope.createOrder = function() {

								if (validate($scope.order)) {
									$("#errorMsg").hide();
									$scope.order.modeOfBuying = $(
											'#mode :selected').text();
									decathlonService
											.createOrder($scope.order)
											.then(
													function(d) {
														if (angular
																.isDefined(d.errorMessage)
																&& !angular
																		.equals(
																				d.errorMessage,
																				null)) {
															$("#errorMsg")
																	.show();
															$scope.errorMsg = d.errorMessage;

														} else {
															$("#successMsg")
																	.show();
															$scope.successMsg = d;
														}
													},
													function(errResponse) {
														$("#errorMsg").show();
														$scope.errorMsg = "Something went wrong. please contact support Team."

													});
								}
							}
							function validate(order) {
								$("#errorMsg").hide();
								$("#successMsg").hide();
								if (order.customerName == undefined
										|| order.customerName == "") {
									$("#errorMsg").show();
									$scope.errorMsg = "Please enter customer name!!";
									return false;
								} else if (order.orderDate == undefined
										|| order.orderDate == "") {
									$("#errorMsg").show();
									$scope.errorMsg = "Please select the order date";
									return false;
								} else if ($('#mode :selected').text() == "") {
									$("#errorMsg").show();
									$scope.errorMsg = "Please select the mode of buying";
									return false;
								}
								return true;
							}
						} ]);

decathlonApp.controller('statusController', [ '$scope', 'decathlonService',
		'$interval', function($scope, decathlonService, $interval) {
			$scope.order = {};
			$("#successMsg").hide();
			$("#errorMsg").hide();
			$scope.updateOrderStatus=function(){
				if(validateOrder($scope.order)){
					$("#errorMsg").hide();
					$("#successMsg").hide();
					$scope.order.orderState=$('#status :selected').text();
					decathlonService
					.updateStatus($scope.order)
					.then(
							function(d) {
								if (angular
										.isDefined(d.errorMessage)
										&& !angular
												.equals(
														d.errorMessage,
														null)) {
									$("#errorMsg")
											.show();
									$scope.errorMsg = d.errorMessage;

								} else {
									$("#successMsg")
											.show();
									$scope.successMsg = d;
								}
							},
							function(errResponse) {
								$("#errorMsg").show();
								$scope.errorMsg = "Something went wrong. please contact support Team."

							});
		
				}
			}
			function validateOrder(order){
				if(order.orderId=="" || order.orderId==undefined){
					$("#errorMsg").show();
					$scope.errorMsg = "Please enter order Id";
					return false;
				}else if($('#status :selected').text() == ""){
					$("#errorMsg").show();
					$scope.errorMsg = "Please select any order status";
					return false;
				}
				return true;
			}
		} ]);
