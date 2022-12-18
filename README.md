# orders-2023-2

## Technology:

- Java 17
- Maven 3.8.6

## Project structure

### Modules:

- api (orders-api) - data structures (java records), public interfaces
- application (orders-application) - domain logic implementation
- infrastructure (orders-infrastructure) - infrastructure implementation details required by domain (application)

### Versioning:

Using `$revision` mechanism (https://maven.apache.org/maven-ci-friendly.html)

### Contexts

#### 1. Orders

#### 1.1 Functionality

Projected in `pl.edu.wszib.orders.api.order.OrderFacadeApi`

- create order
- add product
- remove product
- increase product quantity
- decrease product quantity (you cannot decrease product quantity to 0)
- set product quantity
- get order
- adding the same product multiple times results increasing quantity 

#### 1.2 Data structure

#### 1.2.1 Order

- id
- items
- amount

#### 1.2.2 Item

- product
- quantity (positive int)
- amount

#### 2. Products

#### 2.1 Functionality

- create product
- search/get product

#### 2.2 Data structure

- id
- name
- price
