package teamup

class HomeController {

    def index()
    {
        def events=Event.findAllByTimeOfDayGreaterThan(new Date())
        render(view: 'index', model: [events:events])

    }
}
