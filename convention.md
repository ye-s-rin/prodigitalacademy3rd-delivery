## 깃허브 컨벤션

- [Udacity Git Commit Message Style Guide](https://udacity.github.io/git-styleguide/)
- Commit Type
    - **feat:** A new feature
    - **fix:** A bug fix
    - **docs:** Changes to documentation
    - **style:** Formatting, missing semi colons, etc; no code change
    - **refactor:** Refactoring production code
    - **test:** Adding tests, refactoring test; no production code change
    - **chore:** Updating build tasks, package manager configs, etc; no production code change
- 커밋 타입
    - `feat` : 새로운 기능 추가
    - `fix` : 버그 수정
    - `docs` : 문서 수정
    - `style` : 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우
    - `refactor` : 코드 리펙토링
    - `test` : 테스트 코드, 리펙토링 테스트 코드 추가
    - `chore` : 빌드 업무 수정, 패키지 매니저 수정


## 코드 컨벤션

- [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- tab size: 4  indent: 4
- 플러그인
    - [google-java-format - IntelliJ IDEs Plugin | Marketplace](https://plugins.jetbrains.com/plugin/8527-google-java-format)
    - **IntelliJ JRE Config**

      The google-java-format plugin uses some internal classes that aren't available without extra configuration. To use the plugin, go to `Help→Edit Custom VM Options...` and paste in these lines:

        - -add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED
          --add-exports=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED
          --add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED
          --add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED
          --add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED
          --add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED
- .xml 다운로드
    - [intellij-java-google-style.xml](https://prod-files-secure.s3.us-west-2.amazonaws.com/1c528f38-a72a-4c2f-9a6f-55492915f274/3c41d9ed-e6df-4b1b-bfba-0d7f74f66744/intellij-java-google-style.xml)
- 윈도우: **Ctrl + Alt+ L**
- 맥 OS: **Cmd + Option + L**