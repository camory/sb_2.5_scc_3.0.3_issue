package contracts

import org.springframework.cloud.contract.spec.Contract

import static org.springframework.cloud.contract.spec.internal.HttpStatus.OK
import static org.springframework.cloud.contract.spec.internal.MediaTypes.APPLICATION_JSON

Contract.make {
    description """
                Should match any Integer
                """
    request {
        method 'GET'
        url '/values'
        headers {
            contentType APPLICATION_JSON
        }
    }
    response {
        status OK
        headers {
            contentType APPLICATION_JSON
        }
        body([
                "value": anyInteger()
        ])
    }
}
