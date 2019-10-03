# Models
## Movie
```
id: int
title: string
slug: string -> Unique identifier for the movie. Generated from the title. 
category: string -> ACTION, COMEDY, DRAMA, e.t.c
runtime: int -> Movie length in minutes.
type: string -> original or suggested.
companies: ProductionCompany[]
```

## ProductionCompany
```
id: int
name: string
slug: string -> Unique identifier for the company. Generated from the name. 
```

## User
```
id: int
name: string
idNumber: string -> Used to tag requests.
```

## Errors
```
message: string
```

# Routes
## User
### POST /users
Register a user.

Returns a user object.

## Movies
### GET /movies
Query for all movies.  

Returns a list of movie objects.

### GET /movies/{categoryId}?type={type}
Query for movies.  

Returns a list of movie objects.

### POST /movies
Suggest a movie.

Returns a movie object.

### PUT /movies/{id}
Update a movie

Returns the updated movie object.

### DELETE /movies/{id}
Delete a movie.

Returns `No Content`

## Production company
### GET /companies
Get all production companies.

Returns a list of production companies.

### GET /companies?name={name}
Search for production companies matching the name.

Returns a list of production companies.

### GET /companies/{id}
Get a production company.

Returns a production company.

### POST /companies
Create a production company.

Returns the created production company. 

### PUT /companies/{id}
Update a production company.

Returns the updated production company. 

### DELETE /companies/{id}
Delete a production company.

Returns `No Content`
