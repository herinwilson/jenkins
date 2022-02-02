listview('test view'){
    description('test view')
    jobs{
        regex('.*.dsl')
    }
    columns {
        status()
        weather()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildbutton()
        name()
    }
}
