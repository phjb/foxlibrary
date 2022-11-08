![fox library's banner](.idea_images/a627f2ee.png)

# 🦊 Fox Library 🦊

This is a really cool project for a digital library! 

## Table of contents


* [Some ideas](#some-ideas-)
    * [Books](#-books)
    * [Audios](#-audios)
    * [Videos](#-videos)
    * [Photos](#-photos)
* [Class Diagram](#class-diagram)

## Some ideas 💡

### 📚 Books
Here is some ideas for the books.

### Attributes

| BOOK        |
|-------------|
| TYPE        |
| ISBN        |
| TITTLE      |
| AUTHOR      |
| PAGE_NUMBER |
| SIZE_MB     |
| YEAR        |
| PUBLISHER   |
| CATEGORY    |
| LANGUAGE    |
| DESCRIPTION |
| PICTURE     |


### Actions
- Register;
- Update;
- Delete - logic;

**Search:**

- By title;
- By isbn;
- By author;
- By categories;
- By pages number;
- By publisher;
___

### 🎧 Audios

- Register;
- Update;
- Delete - logic;

**Search:**

- By title;
- By singer;
- By genres;
- By album;
- By minutes interval;
- By record company;
___




### 🎞️ Videos

### 📷 Photos

## Class Diagram

![](.idea_images/4c319415.png)

```puml
@startuml

package com.paulobarbosa.foxlibrary.book {

abstract class ClassBase{
- id: int
}

abstract class Person{
- name: string
- info: string
}


 class Archive{
}

 class Publisher{
}

 class Category{
}

 class Language{
}

enum Type <<enumeration>>{
}

 class Book {
 - title: string
 - isbn: string
 - page_number: int
 - description: string
 - size_mb: float
 - publisher_id: int
 - language_id: int
 - picture_id: int
 + void: register()
}

class RelBookType{
- book_id: int
- type_id: int
}

class RelBookAuthor{
- book_id: int
- author_id: int
}

class RelBookCategory{
- book_id: int
- category_id: int
}


ClassBase <|-- Person
'ClassBase <|-- Archive
'ClassBase <|-- Publisher
'ClassBase <|-- Category
'ClassBase <|-- Language

Person <|-- Author : "< inherits "


Book  *--> " 1..1  " Language : " has >"
Book  o--> " 0..1  " Publisher : " has >"
Book  o--> " 0..1  " Archive : " has >"

RelBookType -down-> "1..*   " Book : " contains >"
RelBookType -down-> "1..*   " Type : " contains >"

RelBookAuthor -down-> "1..* " Book : " contains >"
RelBookAuthor -down-> "1..*   " Author : " contains >"

RelBookCategory -down-> "1..*   " Book : " contains >"
RelBookCategory -down-> "1..*   " Category : " contains >"

}
@enduml
```
