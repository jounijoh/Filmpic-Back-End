# Filmpic Backend 

The backend for the Filmpic website is a Spring Boot application designed to manage film photographic content, including photographs, films, cameras, and user accounts. It is integrated with local MariaDB for persistent data storage. 

### This backend has simple UI frontend built with Thymeleaf
  ![filmpic-backend-ui](https://github.com/jounijoh/Filmpic-Back-End/assets/95469212/0159e878-bc6b-41f2-894e-5e659a131cf9)
- *NOTE* backend is not deployed and works only locally for now
- You can checkout my Filmpic frontend website that utilizes this database here: [Repository](https://github.com/jounijoh/homepage) & [Website](https://jounijoh.github.io/homepage/)

## Key Features

1. **Photograph Management**:
    - List all photographs with optional keyword search.
    - Add, edit, and delete photographs. Photographs have a title, description, file path, associated film, camera, and a user.
    - Photograph file paths are structured as `/images/[filename].jpg`.

2. **Film Management**:
    - List all films.
    - Add, edit, and delete films. Films have attributes like name, type (e.g., black and white, color), format (e.g., 35mm), and ISO speed.

3. **Camera Management**:
    - List all cameras.
    - Add, edit, and delete camera details. Cameras have a name and a format.

4. **User Management**:
    - List all users (Admin access required).
    - Register a new user. Users have attributes such as username, first name, last name, password, email, and role.

5. **Authentication and Authorization**:
    - Built-in user authentication system using Spring Security.
    - Role-based access control (e.g., 'ADMIN', 'USER').

## MariaDB Integration

The backend uses MariaDB for data storage. You'll need to ensure that the MariaDB instance is running and correctly configured to interact with this backend. The database connection parameters (URL, username, password) should be set in the application's properties or environment variables.


## API Endpoints

For easy navigation and understanding, here's a quick list of the main API endpoints:

- `/allphotos`: View all photos with optional keyword search.
- `/addphoto`: Add a new photograph.
- `/allfilms`: List all films.
- `/addfilm`: Add a new film.
- `/allcameras`: List all cameras.
- `/addcamera`: Add a new camera.
- `/allusers`: List all users (Admin only).
- `/createuser`: Register a new user.

## Notes

The commented-out section in the `FilmpicApplication` class provides a demo setup, which seeds the database with example data on startup. 





