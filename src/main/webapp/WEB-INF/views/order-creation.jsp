<style>
</style>
<div class="alert alert-success" id="successMsg"><strong>{{successMsg}}</strong></div>
<div class="alert alert-danger" id="errorMsg">{{errorMsg}}</div>
<div class="content-wrap container-fluid"
	style="background-color: #009ee72b; margin-left: 30px;margin-right: 30px; margin-top: 20px;">
	<h3>Please fill the below details for order creation</h3>
	<div class=" form-group">
		<label for="name">Customer Name<span style="color: red">*</span>:
		</label> <input type="text" class="form-control" id="cname" value=""
			ng-model="order.customerName" style="width: 20%; display: inline;">
	</div>


	<div class="form-group">
		<label for="mode">Mode of buying<span style="color: red">*</span>:
		</label> <select class="form-control" id="mode"
			style="width: 20%; display: inline;">
			<option value=""></option>
			<option value="online">online</option>
			<option value="store">store</option>
		</select>
	</div>

	<div class=" form-group">
		<label for="orderdate">Order date<span style="color: red">*</span>:
		</label> <input type="date" class="form-control" ng-model="order.orderDate"
			value="" style="width: 20%; display: inline; margin-left: 34px;"
			name="orderdate">
	</div>
	<br>
	<div class="col-md-4 text-center">
		<button id="singlebutton" name="singlebutton" class="btn btn-primary"
			ng-click="createOrder()">Create Order</button>
	</div>

</div>