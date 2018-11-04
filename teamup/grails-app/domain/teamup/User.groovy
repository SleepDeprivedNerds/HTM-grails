package teamup

class User {

    String username
    String password


    static constraints = {
        username maxSize: 100, blank: false;
        password maxSize: 100, blank: false
    }
    String toString()
    {
        return username
    }
}
