
# spring-graphql-example

This is a simple api that uses Spring boot, GraphQL and PostgresSQL.

## How to run the project

In the root of the project, there's a `docker-compose.yml` file, where you can start the Docker container of a Postgres SQL database.

Run with: `docker compose up -d`

After that, you can run the application.

Access `http://localhost:8080/graphiql` and use the GraphQL UI to write your requests, See some examples below:

## How to send requests using GraphQL

Access the UI and send the request to 2 controllers created: authors and books:


#### Example to request data to authors:
```
{
  authors{
    id
    name
    country
  }
}
```
#### Expected response from authors:
```
{
  "data": {
    "authors": [
      {
        "id": "1",
        "name": "J.R.R Tolkien",
        "country": "UK"
      },
      {
        "id": "2",
        "name": "J.K Rowling",
        "country": "UK"
      },
      {
        "id": "3",
        "name": "George Orwell",
        "country": "UK"
      },
      {
        "id": "4",
        "name": "Miguel de Cervantes",
        "country": "Spain"
      },
      {
        "id": "5",
        "name": "Gabriel García Márquez",
        "country": "Colombia"
      }
    ]
  }
}
```

#### Example to request data to books:
```
{
  books{
    id
    name
    pageCount
    author{
      id
      name
      country
    }
  }
}
```

#### Expected response from books:
```
{
  "data": {
    "books": [
      {
        "id": "1",
        "name": "The Lord of the Rings",
        "pageCount": 1200,
        "author": {
          "id": "1",
          "name": "J.R.R Tolkien",
          "country": "UK"
        }
      },
      {
        "id": "2",
        "name": "Harry Potter and the Philosophers Stone",
        "pageCount": 309,
        "author": {
          "id": "2",
          "name": "J.K Rowling",
          "country": "UK"
        }
      },
      {
        "id": "3",
        "name": "1984",
        "pageCount": 328,
        "author": {
          "id": "3",
          "name": "George Orwell",
          "country": "UK"
        }
      },
      {
        "id": "4",
        "name": "Dom Quixote",
        "pageCount": 1072,
        "author": {
          "id": "4",
          "name": "Miguel de Cervantes",
          "country": "Spain"
        }
      },
      {
        "id": "5",
        "name": "100 years of solitude",
        "pageCount": 417,
        "author": {
          "id": "5",
          "name": "Gabriel García Márquez",
          "country": "Colombia"
        }
      }
    ]
  }
}
```
### You can send a request passing a parameter and defining what fields to see in the response:

```
{
  bookById(id: 2){
    id
    name
    author{
      name
    }
  }
}
```

### Expected response
```
{
  "data": {
    "bookById": {
      "id": "2",
      "name": "Harry Potter and the Philosophers Stone",
      "author": {
        "name": "J.K Rowling"
      }
    }
  }
}
```

### You can send multiple requests at the same time

```
{
  bookById(id: 2){
    name
    author{
      name
    }
  }
  books{
    name
    pageCount
  }
}
```

### Expected response
```
{
  "data": {
    "bookById": {
      "name": "Harry Potter and the Philosophers Stone",
      "author": {
        "name": "J.K Rowling"
      }
    },
    "books": [
      {
        "name": "The Lord of the Rings",
        "pageCount": 1200
      },
      {
        "name": "Harry Potter and the Philosophers Stone",
        "pageCount": 309
      },
      {
        "name": "1984",
        "pageCount": 328
      },
      {
        "name": "Dom Quixote",
        "pageCount": 1072
      },
      {
        "name": "100 years of solitude",
        "pageCount": 417
      }
    ]
  }
}
```

For more information, check the official documentation: `https://graphql.org/learn/`