# dokos-rest-api
A RESTful API for the purpose of storing results from games and rounds of the card game Doppelkopf, which is mainly played in northern Germany.

## Build info
1. build the Spring Boot project by executing the gradle wrapper in the root folder of the project as follows:
    ```shell
    ./gradlew clean build -x test
    ```

2. try to run the compose file with the command
    ```shell
    podman compose --file podman-compose.yml up --detach --remove-orphans
    ```
   when you want to shut the application down type
   ```shell
   podman compose --file podman-compose.yml down
   ```
   
