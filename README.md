**Spring Boot Day 9 Exercise**
Exercise Title: API Versioning and Custom Response Format

Objective:

Learn how to implement REST API versioning and wrap API responses in a standard structure to
maintain backward compatibility and consistency across responses.

Tasks to Implement:

1. Implement API versioning using URI-based strategy:
- GET /api/v1/users - returns UserDTO with basic info
- GET /api/v2/users - returns UserDTO with post count
2. Create a custom response wrapper class `ApiResponse<T>` with:
- data: actual payload
- status: HTTP status (success/fail)
- message: description
- timestamp: time of response
3. Refactor GET endpoints to return ApiResponse<UserDTO> instead of plain DTO.
4. Ensure Postman shows a consistent response for both versions.
  
Bonus Challenge:

Use `@RequestHeader("X-API-VERSION")` for header-based versioning and implement the same
for posts.

Submission Checklist:

- v1 and v2 APIs work with different return formats
- ApiResponse wrapper used
- Bonus: Header-based versioning added and tested
