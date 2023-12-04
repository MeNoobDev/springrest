# SpringREST - Spring Boot REST API Project

This is a SpringBoot Rest API project that features CRUD (Create, Read, Update, Delete) operations on courses. The project uses a MySQL database hosted on Aiven.
To reach endpoints all, use an API client like Postman or cURL.

## Database
The project utilizes a MySQL database hosted on Aiven for data storage. Ensure the necessary database configurations are set up in the application properties file.

## Endpoints

- **Home**:
    - URL: `/home`
    - Method: `GET`
    - Description: Returns a welcome message for the SpringBoot Rest API project.
    ![home](screenshots/home.png)
<br>

- **Get All Courses**:
    - URL: `/courses`
    - Method: `GET`
    - Description: Fetches a list of all courses.
  ![get_courses](screenshots/get_courses.png)
  <br>

- **Get Course by ID**:
    - URL: `/courses/{courseId}`
    - Method: `GET`
    - Description: Fetches details of a specific course identified by `{courseId}`.
  ![get_courses_id](screenshots/get_courses_id.png)
  <br>

- **Add a New Course**:
    - URL: `/courses`
    - Method: `POST`
    - Description: Adds a new course. Requires a JSON payload with course details.
  ![post_courses](screenshots/post_courses.png)
  <br>

- **Update Course**:
    - URL: `/courses`
    - Method: `PUT`
    - Description: Updates an existing course. Requires a JSON payload with the updated course details.
  ![put_courses](screenshots/put_courses.png)
  <br>

- **Delete Course by ID**:
    - URL: `/courses/{courseId}`
    - Method: `DELETE`
    - Description: Deletes the course identified by `{courseId}`.
  ![delete_courses](screenshots/delete_courses.png)
  <br>

