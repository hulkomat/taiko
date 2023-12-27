---
runme:
  id: 01HJDWS0HVG7DSKJ79QP20MW2V
  version: v2.0
---

# taiko

Taiko for e2e testing. This is going to be a demo project and should show you in its final form how to set up [gauge](gauge.org), [taiko](taiko.org) and a simple web application (java, angular) to run behavior driven tests.

To run the whole application, with the database, the backend, and the frontend you can use the docker-compose.yml by simply running

```sh {"id":"01HJJJ2J91E5A4ET7DWXCH5A06"}
docker compose --env-file=local.env up -d --quiet-pull --wait --force-recreate --remove-orphans
```

- `--quiet-pull` reduces the output
- `--wait` shows you a status screen until all services are healthy
- `-d` for continue to run even if you close the terminal where you started the command

After starting the docker stack you can run the gauge tests by running the following command:

```sh {"id":"01HJN7AFANY8GS4JC4RCEH3JZE"}
cd gauge && \
npm install && \
npm test
```

After a runthrough we can see the results when we open the `index.html` in `/gauge/reports/html-report`.
