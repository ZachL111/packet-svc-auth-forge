# packet-svc-auth-forge

`packet-svc-auth-forge` explores backend services with a small Kotlin codebase and local fixtures. The technical goal is to design a Kotlin verification harness for auth systems, covering incremental indexing, append-only fixtures, and failure-oriented tests.

## Why It Exists

This is intentionally local and self-contained so it can be inspected without credentials, services, or seeded history.

## Packet Svc Auth Forge Review Notes

The first comparison I would make is `worker slack` against `session drift` because it shows where the rule is most opinionated.

## Features

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/packet-svc-auth-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `worker slack` and `session drift`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture Notes

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `queue pressure`, `retry load`, `worker slack`, and `session drift`.

The Kotlin addition stays small enough to inspect in one sitting.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The check exercises the source code and the review fixture. `edge` is the high score at 222; `recovery` is the low score at 126.

## Limitations And Roadmap

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.
