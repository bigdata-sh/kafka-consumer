# kafka-consumer

Kafka-consumer is a message reader of kafka for Big data.

# features

* The Kafka data is continuously received by this which used the high-level / low-level API of Kafka.


* Failures process, We simply decide at the beginning of every batch interval what is the range of offsets to consume.
                    the data corresponding to the offset ranges is read from Kakfa for processing, These offsets are
                    also saved reliably with zookeeper and used to recompute the data to recover from failures.

# requirements

- JDK1.7 or higher version

- Maven 3.2 or higher

- Zookeeper 3.3

- Kafka-0.8

# build

to build the project, simply run the command as below

```
    mvn clean install
```

# usage