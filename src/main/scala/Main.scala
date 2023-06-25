case class AppUser(
    id: Long,
    firstName: Option[String],
    @SqlName("last_name") lastName: String
)

@main def hello: Unit =
  println(sqlFieldNamesFor[AppUser])
