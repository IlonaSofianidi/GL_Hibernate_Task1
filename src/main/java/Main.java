import dao.daoImpl.DepartmentDao;
import dao.daoImpl.WorkerDao;
import entity.Department;
import entity.Worker;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        WorkerDao workerDao = new WorkerDao();
        workerDao.openSessionTransaction();
        List<Worker> workerList = workerDao.getAll();
        System.out.println(Arrays.toString(workerList.toArray()));
        workerDao.getCurrentSession().close();

        DepartmentDao departmentDao = new DepartmentDao();
        departmentDao.openSessionTransaction();
        Optional<Department> department = departmentDao.get(1);
        System.out.println(department.toString());
        departmentDao.getCurrentSession().close();

    }
}
