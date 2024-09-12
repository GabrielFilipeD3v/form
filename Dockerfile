FROM postgres:15

RUN apt-get update && \
    apt-get install -y postgresql-server-dev-15 python3-pip && \
    pip3 install pgml

RUN echo "CREATE EXTENSION pgml;" > /docker-entrypoint-initdb.d/create_pgml_extension.sql
