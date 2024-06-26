package net.texala.employee.constants;

public class Constants {
	
	public static final String EMPLOYEE_MASTER = "employee_master";
	public static final String UPDATE_EMPLOYEE_STATUS = "update Employee a set a.status=:status where a.id=:id";
	public static final String EMPLOYEE_NOT_FOUND = "Employee not found with id: ";
	public static final String[] EMPLOYEE_HEADER = { "ID", "FIRSTNAME", "LASTNAME", "AGE", "EMAIL", "GENDER", "SALARY",
			"STATUS", "CREATEDDATE", "CONTACTNUMBER", "DOB", "HIREDATE", "JOBTITLE" };
	public static final String FIRSTNAME_REQUIRED = "FirstName is Required";
	public static final String LASTNAME_REQUIRED = "LastName is Required";
	public static final String AGE_REQUIRED = "Age is Required";
	public static final String GENDER_REQUIRED = "Gender is Required";
	public static final String SALARY_REQUIRED = "Salary is Required";
	public static final String EMAIL_VALID_ERROR_MESSAGE = "Email must be valid";
	public static final String NON_NEGATIVE_SALARY_ERROR_MESSAGE = "Salary must be non-negative";
	public static final String FIRSTNAME_ERROR_MESSAGE = "firstName must contain only alphabetic characters";
	public static final String LASTNAME_ERROR_MESSAGE = "lastname must contain only alphabetic characters";
	public static final String MIN_AGE_ERROR_MESSAGE = "Age must be at least 18";
	public static final String MAX_AGE_ERROR_MESSAGE = "Age must be at most 100";
	public static final String EMAIL_REQUIRED = "Email address is required";
	public static final String BUDGET_REQUIRED = "Budget is required";
	public static final String CONTACT_NUMBER = "ContactNumber";
	public static final String DOB = "DateOfBirth";
	public static final String HIRE_DATE = "HireDate";
	public static final String JOB_TITLE = "JobTitle";
	public static final String CONTACT_NUMBER_REQUIRED = "Contact number is required";
	public static final String DOB_REQUIRED = "Date of birth is required";
	public static final String HIREDATE_REQUIRED = "Hire date is required";
	public static final String JOB_TITLE_REQUIRED = "Jobtitle is required";
	public static final String DOWNLOAD_SUCCESS_MESSAGE = "download successful";
	public static final String CONTACT_NUMBER_FORMAT_ERROR_MESSAGE = "Contact number should be 10 digits";
	public static final String DOB_PAST_ERROR_MESSAGE = "Date of birth should be in the past";
	public static final String JOB_TITLE_LENGTH_ERROR_MESSAGE = "Job title length should not exceed maximum characters";
	public static final String FAILED_ADD_EMP = "Failed to add employee: ";
	
	
	public static final String DEPARTMENT_MASTER = "department_master";
	public static final String DEPT_ID = "deptId";
	public static final String DEPT_NAME = "deptName";
	public static final String CREATED_DATE = "created_date";
	public static final String UPDATE_DEPARTMENT_STATUS = "update Department a set a.status=:status where a.id=:id";
	public static final String DEPARTMENT_NOT_FOUND = "Department not found with id: ";
	public static final String[] DEPARTMENT_HEADER = { "ID", "DEPTNAME", "STATUS", "CREATEDDATE", "DEPT_CONTACT_NUMBER",
			"EMAIL_ADDRESS", "BUDGET" };
	public static final String DEPARTMENT_NAME_REQUIRED = "Department name is required";
	public static final String DATE_REQUIRED = "Created date is required";
	public static final String DEPARTMENT_LENGTH_ERROR_MESSAGE = "Department name must be between 5 and 50 characters";
	public static final String FIRST_NAME = "FirstName";
	public static final String LAST_NAME = "LastName";
	public static final String AGE = "Age";
	public static final String EMAIL = "Email";
	public static final String GENDER = "Gender";
	public static final String SALARY = "Salary";
	public static final String FAILED_ADD_DEPT ="Failed to add department: ";
	public static final String DEPT_CONTACT_NUMBER_FORMAT_ERROR_MESSAGE = "Invalid department contact number format. It should contain exactly 10 digits";
	public static final String BUDGET_MIN_VALUE_ERROR_MESSAGE = "Budget must be greater than 0.0";
	public static final String DEPT_CONTACT_NUMBER = "DeptContactNumber";
	public static final String EMAIL_ADDRESS = "EmailAddress";
	public static final String BUDGET = "Budget";
	public static final String DEPT_CONTACT_NUMBER_REQUIRED = "Department contact number is required";
	public static final String RECORD_STATUS_UPDATE_SUCCESS = "Record status updated successfully";
	public static final String DEPT_WITH_NAME = "Department with Name";
	public static final String ALREADY_EXISTS = " already exists.";
	
	
	public static final String ADDRESS_MASTER = "address_master";
	public static final String ID = "id";
	public static final String STREET = "street";
	public static final String CITY = "city";
	public static final String STATE = "state";
	public static final String ZIPCODE = "zipcode";
	public static final String STATUS = "status";
	public static final String TIMESTAMP = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP";
	public static final String UPDATE_ADDRESS_STATUS = "update Address a set a.status=:status where a.id=:id";
	public static final String ADDRESS_NOT_FOUND = "Address not found with id: ";
	public static final String[] ADDRESS_HEADER = { "ID", "STREET", "CITY", "STATE", "ZIPCODE", "STATUS",
			"CREATED_DATE", "DOOR_NUMBER", "COUNTRY", "ADDRESS_TYPE", "LAND_MARK" };
	public static final String STREET_REQUIRED = "Street is required";
	public static final String CITY_REQUIRED = "City is required";
	public static final String STATE_REQUIRED = "State is required";
	public static final String ZIPCODE_REQUIRED = "Zipcode is required";
	public static final String STATUS_REQUIRED = "Status is required";
	public static final String STREET_LENGTH_ERROR_MESSAGE = "Street length must be less than or equal to 100 characters";
	public static final String CITY_LENGTH_ERROR_MESSAGE = "City must contain only alphabetic characters";
	public static final String STATE_LENGTH_ERROR_MESSAGE = "State must contain only alphabetic characters";
	public static final String ZIPCODE_LENGTH_ERROR_MESSAGE = "Zipcode must be 6 digits";
	public static final String REGEX = "^[a-zA-Z]+$";
	public static final String ZIPCODE_REGEX = "\\d{6}";
	public static final String RECORD_FETCH_SUCCESS_MESSAGE = "Record fetch Succesfully";
	public static final String RECORD_UPDATE_SUCCESS_MESSAGE = "Record update Succesfully";
	public static final String RECORD_ACTIVE_SUCCESS_MESSAGE = "Record activate Succesfully";
	public static final String RECORD_DEACTIVE_SUCCESS_MESSAGE = "Record deactivate Succesfully";
	public static final String RECORD_DELETED_SUCCESS_MESSAGE = "Record Deleted Succesfully";
	public static final String NO_RECORD_FOUND_MESSAGE = "No record Found";
	public static final String RECORD_ADD_SUCCESS_MESSAGE = "Record add Succesfully";
	public static final String PAGE_NO = "pageNo";
	public static final String PAGE_SIZE = "pageSize";
	public static final String SORT_BY = "sortBy";
	public static final String FILTER_BY = "filterBy";
	public static final String SEARCH_TEXT = "searchText";
	public static final String FAILED_ADD_ADD ="Failed to add address: ";
	public static final String DOOR_NUMBER_REQUIRED = "Door number is required.";
	public static final String DOOR_NUMBER_LENGTH_ERROR_MESSAGE = "Door number length must be at most {MAX_DOOR_NUMBER_LENGTH} characters.";
	public static final String COUNTRY_REQUIRED = "Country is required.";
	public static final String COUNTRY_LENGTH_ERROR_MESSAGE = "Country length must be at most {MAX_COUNTRY_LENGTH} characters.";
	public static final String LAND_MARK_REQUIRED = "Land mark is required.";
	public static final String LAND_MARK_LENGTH_ERROR_MESSAGE = "Land mark length must be at most {MAX_LAND_MARK_LENGTH} characters.";
	public static final String DOORNUMBER = "DoorNumber";
	public static final String COUNTRY = "Country";
	public static final String ADDRESS_TYPE = "address_type";
	public static final String LAND_MARK = "LandMark";
		
}
