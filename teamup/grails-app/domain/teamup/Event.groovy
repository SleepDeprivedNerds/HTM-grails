package teamup

class Event {
    String name
    Date timeOfDay
    User user
    static hasMany = [peopleGoing:User]
    List peopleGoing
    String description
    Long lat
    Long lng

    String toString(){
        return name + " " +timeOfDay + " "+ user?.username
    }

    static constraints = {
    }
}
