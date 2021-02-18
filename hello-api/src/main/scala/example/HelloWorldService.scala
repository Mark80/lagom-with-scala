package example

import akka.NotUsed
import com.lightbend.lagom.scaladsl.api.Service._
import com.lightbend.lagom.scaladsl.api.{Descriptor, Service, ServiceCall}

trait HelloWorldService extends Service {

  def hello: ServiceCall[NotUsed, String]

  override def descriptor: Descriptor =
    named("hello-service")
      .withCalls(
        pathCall("/hello-world", hello _),
      )
      .withAutoAcl(true)

}
