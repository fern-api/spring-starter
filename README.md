# Express + Fern starter repo

This repo is a starter repo for building an Express server using [Fern](https://github.com/fern-api/fern).

**Fern is an open source format for defining REST APIs.** Fern makes it easy to:

1. Define your API
1. Implement your API on the backend
1. Consume your API on the frontend

## Quick start

### Step 1: Fork this repo

### Step 2: Clone your fork

### Step 3: Generate code

Most of the code for this server is auto-generated by Fern!

In a terminal, run:

```bash
npm install -g fern-api
fern generate
```

### Step 4: Run the backend

```bash
./gradlew bootRun
```

Now you can cURL the server!

```
curl 'http://localhost:8080/movies/goodwill-hunting'
```

## Development

To get started, open a VSCode window for the root of this repo:

```
./gradlew idea && open *.ipr
```

### Auto-generated server code

Nearly all of the server code is generated by Fern when you run `fern generate`.
The generated code lives in [src/main/java/com/example/generated](src/main/java/com/example/generated).

In addition to saving you time, the auto-generated code gives you compile-time safety
that your API is implemented correctly. For example, if you forget to define the rating property
endpoint, you'll get a compile error:

## Changing the API

The API is defined using [Fern](https://www.buildwithfern.comhttps://www.buildwithfern.com/). The definition
lives in the [fern/](fern/api/definition) directory. You can edit these YAML files
to update the API. Check out the [docs](https://docs.buildwithfern.com/definition) to read more about defining APIs.

Most of the server code in this repo is **automatically generated
by Fern.** You can regenerate the code using the Fern CLI:

```
npm install -g fern
fern generate
```

This will output newly generated code to [src/api/generated](src/api/generated).

When you change your API, you'll get compile errors if you're not implementing
the API correctly.

## Issues & contributing

If you run into any problems while using this ticket, plesae [file an
issue](https://github.com/fern-api/express-starter/issues). Of course, PRs are
welcome and encouraged!
