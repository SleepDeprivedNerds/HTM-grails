package teamup

class LoginController {

    def index()
    {
        def user=User.findByUsernameAndPassword(params?.username,params?.password)
        if (user)
        {

        }
    }

}
