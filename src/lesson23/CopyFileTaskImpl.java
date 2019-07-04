package lesson23;

import lesson20.FileCopyUtils;

public class CopyFileTaskImpl extends AbstractTask implements CopyFileTask {
    private FileCopyUtils copyUtils;
    private String from;
    private String to;

    public CopyFileTaskImpl() {
    }

    public CopyFileTaskImpl(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void setFileCopyUtils(FileCopyWithChannel copyUtils) {
        //this.copyUtils = copyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copyFile(from, to);
        } catch (Exception e) {
            throw new TaskExecutionFailedException(e.getMessage());

        }

    }

    @Override
    public String toString() {
        return "CopyFileTaskImpl{" +
                "copyUtils=" + copyUtils +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}

