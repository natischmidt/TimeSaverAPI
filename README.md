# Time Saver Project

This project enables efficient time entry management. The `TimeService` class, coupled with the `TimeController` REST API, facilitates saving, retrieving, and deleting time entries. This implementation utilizes a repository (`TimeRepo`) to interact with the underlying database.

## Features

- **Save Time Entry:**
  - Use the `POST /timer` endpoint to save a new time entry provided in the DTO (Data Transfer Object).

- **Retrieve All Time Entries:**
  - The `GET /timer` endpoint returns a list of all saved time entries.

- **Delete Time Entry:**
  - Utilize the `DELETE /timer/delete/{id}` endpoint by providing the id of the time entry to be deleted.

## Usage

To integrate this time-saving functionality into your project, follow these steps:

1. **Create a TimeService Instance:**
   ```java
   TimeRepo timeRepo = new TimeRepo(); // Instantiate your TimeRepo
   TimeService timeService = new TimeService(timeRepo);
   ```

2. **Save a Time Entry:**
   - Make a POST request to `/timer` with a JSON payload containing the required time information.

3. **Retrieve All Time Entries:**
   - Make a GET request to `/timer` to get a list of all saved time entries.

4. **Delete a Time Entry:**
   - Make a DELETE request to `/timer/delete/{id}` by providing the actual id to delete a specific time entry.

## Example

### Save Time Entry (POST /timer)

Request:
```json
{
  "time": "14:30:00"
}
```

Response:
```json
{
  "id": 1,
  "time": "14:30:00"
}
```

### Retrieve All Time Entries (GET /timer)

Response:
```json
[
  {
    "id": 1,
    "time": "14:30:00"
  },
  {
    "id": 2,
    "time": "09:45:00"
  },
  // ... other entries
]
```

### Delete Time Entry (DELETE /timer/delete/{id})

Request:
```url
DELETE /timer/delete/1
```

Response:
```json
true
```
