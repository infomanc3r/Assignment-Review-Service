# Assignment Review Service

### Welcome to the Assignment Review Service, a single-page-application built for students to submit assignments and reviewers to review them!
To set this project up you will need to clone this repo and make sure to have the following prerequisites:
- [docker / dockerdesktop](https://www.docker.com/products/docker-desktop/)
- [docker compose](https://docs.docker.com/compose/install/)
- [IntelliJ Idea](https://www.jetbrains.com/idea/download/)
- [Java JRE](https://www.java.com/en/download/manual.jsp) and [JDK 17+](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)
- [npm and node.js](https://docs.npmjs.com/downloading-and-installing-node-js-and-npm) (frontend will be dockerized to remove this requirement very soon!)

## Setup
1. Read the `docker-compose.yml` file and change any ports that you need to based on your local setup
2. Run `docker-compose up`
3. Open the project inside intellij
4. Go to the `application.properties` file and follow the instructions to make your dev profile
5. Look over the code base and familiarize yourself with [Spring Boot docs](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
## Run 
1. Make sure the Docker containers for the PostgreSQL database and pgadmin are running
2. Run the `BackendApplication`
3. In the terminal of your choice, navigate to the root folder of the project and run the following commands:
```
npm run build
npm start
```
4. React should open the frontend in your browser automatically. If it does not, you may navigate to the default http://localhost:3000 or the port that you chose.

**To get an overview of the actual application proposal you can find the docs [here](documents/composition_document.md)**
