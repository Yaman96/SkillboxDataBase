# Skillbox DataBase
Tasks for working with MySQL
There is a Skillbox database consisting of tables:

students(id, name, age, registration_date) courses(id, name, duration, type, description, teacher_id, students_count, price, price_per_hour) teachers(id, name, salary, age) subscription(student_id, course_id, subscription_date) purchaseList(student_name, course_name, price, subscription_date, id, name, student_id, course_id)

Task 1. Create an entity of the Courses table in your project and write code that outputs information about any of the courses.

Task 2. Create all Entity tables and make connections between them for the entire database.

Task 3. There is a PurchaseList table, which indicates which students bought which courses, but only the names of students and the names of courses are indicated there. You need to create a table linking course_id and student_id and write code that will fill it based on the PurchaseList table.
