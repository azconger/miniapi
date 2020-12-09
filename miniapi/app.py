#!/usr/bin/env python
import json
from flask import Flask

app = Flask(__name__)


@app.route('/')
def index():
    return json.dumps(
        {
            'name': 'Hello World',
            'email': 'hello@world.com'
        }
    )


if __name__ == "__main__":
    app.run()
