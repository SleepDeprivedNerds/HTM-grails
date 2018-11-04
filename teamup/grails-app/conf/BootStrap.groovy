import teamup.Event
import teamup.User

class BootStrap {

    def init = { servletContext ->
        new User(username: "Mike" , password: "password").save(failOnError: true)
        new User(username: "Trike" , password: "password").save(failOnError: true)
        new User(username: "Good" , password: "password").save(failOnError: true)
        new User(username: "Bad" , password: "password").save(failOnError: true)

           100.times {
               new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90.0,lng: Math.random()*180.0).save(failOnError: true)

           }     //        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//        new Event(name: 'pizza',timeOfDay: new Date().plus(1),user: User.get(1),peopleGoing: User.getAll(),description: 'Blah',lat: Math.random()*90,lng: Math.random()*180).save(failOnError: true)
//
//

    }
    def destroy = {
    }
}
