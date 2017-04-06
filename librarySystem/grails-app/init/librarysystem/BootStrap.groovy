package librarysystem

class BootStrap {

    def init = { servletContext ->

def librarian1=Librarian
(name: 'james'
email:'james.c@theUni.ac.uk'.
office:'computing',
username:'jamesc123',
passwword:'password1',
telephone:'07819397457',
library:'1',

def librarian2=Librarian
(name: 'thomas'
email:'thomas.b@theUni.ac.uk'.
office:'sport',
username:'jamesc123',
passwword:'abc123',
telephone:'0781963583',
library:'2',

def library1=Library
(namebuilding:'collegiate',
address:'1 cloverfield',
openingHours:'12hours',
location:'north',
studySpaces:'5',

def library2=Library
(namebuilding:'adsetts',
address:'3 redmond',
openingHours:'7hours',
location:'south',
studySpaces:'3',

def book1=Book
(title:'harrypotter',
subject:'fictional',
author:'jkrowling',
isbn:'1234',
dateBorrowed:'1/1/2017',
returnDate:'1/2/2017',
student:'tim',
overdue:'yes',

def book2=Book
(title:'theborrowers',
subject:'nonfiction',
author:'marynorton',
isbn:'32536',
dateBorrowed:'3/4/2017',
returnDate:'10/4/2017',
student:'john',
overdue:'no',

def student1=Student
(name:'ryan',
email:'ryan@shu.co.uk',
username:'ryanb123',
password:'pass123',
studentid:'23088822',
course:'computing',

def student2=Student
(name:'fred',
email:'freddyt123@shu.co.uk',
username:'fredrico1',
password:'abcd1234',
studentid:'2308713',
course:'science',

def course1=Course
(title:'physics',
code:'12563',
leader:'johnjohnson',
department:'science',
description:'a',
studyMode;'long',

def course=2=Course
(title:'sportscience',
code:'111324',
leader:'samwilliams',
department:'sport',
description:'b',
studyMode;'short',

def bookreview1=BookReview
(book:'theborrowers',
dateCreated:2/2/2017'',
student:'john',
review:'wasntverygood',

def bookreview2=BookReview
(book:'harrypotter',
dateCreated:'4/4/2017',
student:'tim',
review:'greatbook',



    }
    def destroy = {
    }
}
