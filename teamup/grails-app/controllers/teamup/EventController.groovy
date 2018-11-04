package teamup

class EventController {

    def index()

    {
        def events=Event.findAllByTimeOfDayGreaterThan(new Date())
        render(view: 'index',model: [events:events ])

    }
    def view()
    {
        def events=Event.findAllByTimeOfDayGreaterThan(new Date())
        def event=Event.findById(params?.id)
        if (event)
        {
            render(view: 'view', model: [event:event,events:events])
        }
        else
        {
            flash.error="Could not find event, please try again"
            redirect(controller: 'home', action: 'index')
        }
    }

}
