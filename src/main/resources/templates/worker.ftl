<div class="generic-container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Worker </span></div>
		<div class="panel-body">
	        <div class="formcontainer">
	            <div class="alert alert-success" role="alert" ng-if="ctrl.successMessage">{{ctrl.successMessage}}</div>
	            <div class="alert alert-danger" role="alert" ng-if="ctrl.errorMessage">{{ctrl.errorMessage}}</div>
	            <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
	                <input type="hidden" ng-model="ctrl.worker.id" />
	                
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="userID">User ID</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.worker.userID" id="userID" class="username form-control input-sm" placeholder="Enter your user id" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="emailID">Email ID</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.worker.emailID" id="emailID" class="username form-control input-sm" placeholder="Enter your email id" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="aadharNo">Aadhar No</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.worker.aadharNo" id="aadharNo" class="username form-control input-sm" placeholder="Enter your aadhar no." required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="panNo">Pan No</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.worker.panNo" id="panNo" class="username form-control input-sm" placeholder="Enter your pan no." required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="firstName">First Name</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.worker.firstName" id="firstName" class="username form-control input-sm" placeholder="Enter your first name" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>
	                
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="lastName">Last Name</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.worker.lastName" id="lastName" class="username form-control input-sm" placeholder="Enter your last name" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>
	                
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="middleName">Middle Name</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.worker.middleName" id="middleName" class="username form-control input-sm" placeholder="Enter your middle name" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="dob">DOB</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.worker.dob" id="dob" class="username form-control input-sm" placeholder="Enter your DOB" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>
	                
	                 <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="gender">Gender</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.worker.gender" id="gender" class="username form-control input-sm" placeholder="Enter your gender" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="permanentAdd">Permanent Add</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.worker.permanentAdd" id="permanentAdd" class="username form-control input-sm" placeholder="Enter your pernanent address" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>
	                
	                 <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="presentAdd">Present Add</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.worker.presentAdd" id="presentAdd" class="username form-control input-sm" placeholder="Enter your present address" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>

	                <div class="row">
	                    <div class="form-actions floatRight">
	                        <input type="submit"  value="{{!ctrl.user.id ? 'Add' : 'Update'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid || myForm.$pristine">
	                        <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
	                    </div>
	                </div>
	            </form>
    	    </div>
		</div>	
    </div>    
</div>