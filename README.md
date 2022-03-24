# MSESEC Coaches for the CYSEC platform

> Cybersecurity coaches targeted for micro and small enterprises


## Coaches

| Coach name                                     | Module name (appendix)                  | State       |
|------------------------------------------------|-----------------------------------------|-------------|
| First Steps in Cybersecurity                   | `first-steps-in-cybersecurity`          | implemented | 
| Deep Dive into Access Management               | `deep-dive-access-management`           | implemented | 
| Deep Dive into Network Security                | `deep-dive-network-security`            | implemented | 
| Deep Dive into Software Security               | `deep-dive-software-security`           | implemented | 
| Going deeper on Backups                        | `going-deeper-on-backups`               | implemented | 
| Risk Management                                | `risk-management`                       | implemented | 
| Business Continuity Management                 | `business-continuity-management `       | implemented | 
| Incident Management                            | `incident-management`                   | implemented | 
| Advanced Organisational and Governance Aspects | `organisational-and-governance-aspects` | implemented |
| Human Resources Security                       | `human-resources-security`              | implemented | 
| Data Protection and Security                   | `data-protection-and-security`          | implemented | 
| Change Management                              | `change-management`                     | prepared    | 
| Next steps in Asset Management                 | `next-steps-asset-management`           | prepared    | 
| Supply Chain Security                          | `supply-chain`                          | prepared | 
| Physical and Environmental Security            | `physical-and-environmental`            | prepared | 

## Build

#### Build all coaches
```
mvn clean package
```

Depending on the differences, the developer must decide whether to deactivate
the languages in the `config.xml` until the required translations have been provided.

#### Extract `source.xlf` files for translations
```
mvn generate-sources -Pextract-translations-to-source -DskipTests
```

#### Prerequisites
* Maven
* Java 8


## License
This project is licensed under the Apache 2.0 license, see [LICENSE](LICENSE).
