import axios from "axios";

const REST_API_BASE_URL = 'http://localhost:8080/api/employee/all';

export const listEmployees = () =>axios.get(REST_API_BASE_URL);

export const createEmployee = (employee) => axios.post('http://localhost:8080/api/employees',employee);

export const getEmployee = (employeeId) => axios.get('http://localhost:8080/api/employees'+'/'+employeeId);

export const updateEmployee = (employeeId , employee) => axios.put('http://localhost:8080/api/employees'+'/'+employeeId , employee);


export const deleteEmployee = (employeeId) => axios.delete('http://localhost:8080/api/employees'+'/'+employeeId);