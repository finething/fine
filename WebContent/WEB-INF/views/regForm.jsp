<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="outer">

	<div class="contact-div">

		<div class="contact-form">
			<form:form modelAttribute="customer" action="addCustomer"
				method="post">
				<fieldset>
					<legend>Customer Information</legend>
					<label>First Name</label>
					<form:input path="firstName" class="input input1"
						placeholder="First Name" />
					<form:errors path="firstName" cssStyle="error" />
					<label>Last Name</label>
					<form:input path="lastName" class="input input1"
						placeholder="Last Name" />
					<form:errors path="lastName" cssStyle="error" />
					<br /> <label>Phone Number</label>
					<form:input path="phoneNumber" class="input input1"
						placeholder="Phone Number" />
					<form:errors path="phoneNumber" cssStyle="error" />
					<label>Email</label>
					<form:input path="email" class="input email" placeholder="Email" />
					<form:errors path="email" cssStyle="error" />
					<br /> <label>Date of Birth</label>
					<form:input type="date" path="dob" class="input date" value="2000-01-01" />
					<form:errors path="dob" cssStyle="error" />
				</fieldset>

				<fieldset>
					<legend>Address Information</legend>
					<label>Address</label>
					<form:input path="address.zip" class="input input1"
						placeholder="Zip" />
					<form:errors path="address.zip" cssStyle="error" />
					<label>Street</label>
					<form:input path="address.street" class="input input1"
						placeholder="Street" />
					<form:errors path="address.street" cssStyle="error" />
					<br /> <label>City</label>
					<form:input path="address.city" class="input input1"
						placeholder="City" />
					<form:errors path="address.city" cssStyle="error" />
					<label>State</label>
					<form:input path="address.state" class="input input1"
						placeholder="State" />
					<form:errors path="address.state" cssStyle="error" />
					<br /> <label>Country</label>
					<form:input path="address.country" class="input input1"
						placeholder="Country" />
					<form:errors path="address.country" cssStyle="error" />

				</fieldset>

				<fieldset>
					<legend>Payment Details</legend>
					<label>Owner Name</label>
					<form:input path="paymentDetails.ownerName" class="input input1"
						placeholder="Owner Name" />
					<form:errors path="paymentDetails.ownerName" cssStyle="error" />

					<label>Card Number</label>
					<form:input path="paymentDetails.cardNumber" class="input input1"
						placeholder="Card Number" />
					<form:errors path="paymentDetails.cardNumber" cssStyle="error" />
					<br /> <label>Payment Details</label>
					<form:input path="paymentDetails.cvv" class="input input1"
						placeholder="CVV" />
					<form:errors path="paymentDetails.cvv" cssStyle="error" />
					<label>Expiry Date</label>
					<form:input path="paymentDetails.exipryDate" type="Date" value="2000-01-01"
						class="input date" placeholder="Expiry Date" />
					<form:errors path="paymentDetails.exipryDate" cssStyle="error" />
					<br />

				</fieldset>
				
				<fieldset>
					<legend>Login Information</legend>
					<label>Username</label>					
					  <form:input path="username" class="input input1"
						placeholder="Owner Name" />
					<form:errors path="username" cssStyle="error" />

					<label>Password</label>
					<form:input path="password" class="input input1"
						placeholder="Card Number" />
					<form:errors path="password" cssStyle="error" />
				</fieldset> 

				<input type="reset" id="btn" class="input sbtn" value="Reset" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <input type="submit" id="btn1" class="input sbtn" value="Submit" />
			</form:form>
		</div>


	</div>
</div>

