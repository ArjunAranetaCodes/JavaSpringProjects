import React from "react";
import { useQuery, gql } from "@apollo/client";

const FILMS_QUERY = gql`
  {
    findAllTodos {
      id
      todo_title
      description
    }
  }
`;

export default function App() {
  const { data, loading, error } = useQuery(FILMS_QUERY);

  if (loading) return "Loading...";
  if (error) return <pre>{error.message}</pre>
  console.log(data)
  return (
    <div>
      <h1>Todos</h1>
      <ul>
        {data.findAllTodos.map((todo) => (
          <li key={todo.id}>{todo.todo_title} {todo.description}</li>
        ))}
      </ul>
    </div>
  );
}