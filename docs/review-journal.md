# Review Journal

This journal records the domain cases that matter before widening the public API.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 138, lane `watch`
- `stress`: `retry load`, score 135, lane `watch`
- `edge`: `worker slack`, score 222, lane `ship`
- `recovery`: `session drift`, score 126, lane `watch`
- `stale`: `queue pressure`, score 150, lane `ship`

## Note

The repository should be understandable without pretending it is larger than it is.
