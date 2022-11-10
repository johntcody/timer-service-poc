# Timer Service

This Timer Service demonstrates how to use a Quartz schedule in clustered mode.
When a Quartz timer is properly configured in clustered mode, then only one container is responsible for running the timer.
If that container is removed or taken out of service, then another container should pick up the running of the timer.



The pom.xml file has the minimum dependencies needed to get this application up and running.

To run the application.