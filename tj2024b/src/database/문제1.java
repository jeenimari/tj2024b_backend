# 테이블이 있다는 가정하에 SQL만 작성, 풀이후 (테스트)실행 불가능
/* 
[문제1]: employees 테이블에 새로운 직원을 추가하세요. 직원의 정보는 다음과 같습니다:
employee_id: 101
first_name: 'John'
last_name: 'Doe'
email: 'johndoe@example.com'
hire_date: '2024-06-24'
job_id: 'IT_PROG'

[문제2]: products 테이블에 새로운 제품을 추가하세요. 제품의 정보는 다음과 같습니다:
product_id: 201
product_name: 'Wireless Mouse'
category: 'Electronics'
price: 29.99
stock_quantity: 150

[문제3]: employees 테이블에서 모든 직원의 first_name과 email을 조회하세요.

[문제4]: products 테이블에서 price가 1000 인 제품의 product_name과 price를 조회하세요.

[문제5]: employees 테이블에서 employee_id가 101인 직원의 email을 'john.doe@company.com'으로 업데이트하세요.

[문제6]: products 테이블에서 product_id가 201인 제품의 price를 24.99로 업데이트하세요.

[문제7]: employees 테이블에서 employee_id가 101인 직원을 삭제하세요.

[문제8]: products 테이블에서 product_id가 201인 제품을 삭제하세요.

*/
# 문제 1
insert into employees(employee_id ,first_name, last_name,email,hire,date,job_id) values)100 ,
#문제 2
insert into (product_id,procut_name,category,price,stock_quantity)values(201,'wireless Mouse','Electronics',29.99,150),
#문제 3
select first_name , eamil from employess;

#문제 4
select product_name , price from proudcts where price =1000;

#문제 5
update employess set email = 'john.doe@company.com' where employee_id = 101;

#문제6
update products set pirce = 24.99 where product_id = 201;

#문제 7
delete form employess where employee_id = 101;

#문제 8
delete from products where product_id = 201;


